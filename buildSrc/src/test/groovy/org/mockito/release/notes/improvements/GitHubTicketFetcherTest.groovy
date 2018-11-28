package org.mockito.release.notes.improvements

import spock.lang.IgnoreIf
import spock.lang.Specification
import spock.lang.Subject
import testutil.OfflineChecker

@IgnoreIf({ OfflineChecker.isOffline()})
class GitHubTicketFetcherTest extends Specification {

    @Subject fetcher = new GitHubTicketFetcher()

    //TODO SF tidy up this and the test subject
    def "fetches improvements from GitHub"() {
    }
}
